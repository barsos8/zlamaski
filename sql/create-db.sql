DROP SCHEMA PUBLIC CASCADE;

CREATE TABLE users (
    user_id INT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    registration_token VARCHAR(20),
    last_login_date TIMESTAMP,
    failed_login_attempts INT DEFAULT 0,
    role VARCHAR(50) CHECK (role IN ('STUDENT', 'TEACHER', 'ADMIN')),
    status BOOLEAN NOT NULL
);

CREATE TABLE groups (
    group_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    students_begin_year INT,
    study_direction VARCHAR(100)
);

CREATE TABLE students (
    indeks_no VARCHAR(20) PRIMARY KEY,
    user_id INT UNIQUE NOT NULL, 
    group_id INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (group_id) REFERENCES groups(group_id)
);

CREATE TABLE teachers (
    user_id INT PRIMARY KEY,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);


CREATE TABLE subjects (
    subject_id INT PRIMARY KEY,
    title VARCHAR(255),
    code VARCHAR(20) NULL,
    semester VARCHAR(20),
    ects INT,
    number_of_seats INT
);

CREATE TABLE subject_teach (
    subject_teach_id INT PRIMARY KEY,
    subject_id INT,
    teacher_id INT,
    group_id INT,
    semester VARCHAR(20),
    FOREIGN KEY (subject_id) REFERENCES subjects(subject_id),
    FOREIGN KEY (teacher_id) REFERENCES teachers(user_id),
    FOREIGN KEY (group_id) REFERENCES groups(group_id)
);

CREATE TABLE schedule (
    schedule_id INT PRIMARY KEY,
    subject_id INT,
    group_id INT,
    semester VARCHAR(20),
    day_of_week VARCHAR(15) CHECK (day_of_week IN ('MONDAY','TUESDAY','WEDNESDAY','THURSDAY','FRIDAY')),
    start_time TIME,
    end_time TIME,
    room VARCHAR(50),
    subject_teach_id INT,
    FOREIGN KEY (subject_teach_id) REFERENCES subject_teach(subject_teach_id),
    FOREIGN KEY (group_id) REFERENCES groups(group_id)
);

CREATE TABLE enrollments (
    enrollment_id INT PRIMARY KEY,
    student_id VARCHAR(20),
    subject_id INT,
    schedule_id INT NULL,
    semester VARCHAR(20),
    enrollment_date TIMESTAMP,
    status VARCHAR(20) CHECK (status IN ('ACTIVE', 'WITHDRAWN')),
    is_waiting_on_list BOOLEAN,
    resignation_deadline DATE,
    FOREIGN KEY (student_id) REFERENCES students(indeks_no),
    FOREIGN KEY (subject_id) REFERENCES subjects(subject_id),
    FOREIGN KEY (schedule_id) REFERENCES schedule(schedule_id)
);

CREATE TABLE marks (
    mark_id INT PRIMARY KEY,
    enrollment_id INT,
    date TIMESTAMP,
    value FLOAT,
    type VARCHAR(20) CHECK (type IN ('EXAM', 'ASSIGNMENT', 'PROJECT')),
    comment VARCHAR(5000),
    FOREIGN KEY (enrollment_id) REFERENCES enrollments(enrollment_id)
);

CREATE TABLE books (
    book_id INT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    publisher VARCHAR(255),
    issue_date DATE,
    status VARCHAR(20) CHECK (status IN ('AVAILABLE', 'RENTED', 'REMOVED'))
);

CREATE TABLE rent_book (
    rent_book_id INT PRIMARY KEY,
    book_id INT,
    student_id VARCHAR(20),
    rent_date TIMESTAMP,
    return_date TIMESTAMP,
    returned BOOLEAN,
    overdue BOOLEAN,
    FOREIGN KEY (book_id) REFERENCES books(book_id),
    FOREIGN KEY (student_id) REFERENCES students(indeks_no)
);

CREATE TABLE payments (
    payment_id INT PRIMARY KEY,
    student_id  VARCHAR(20),
    amount DECIMAL(10, 2),
    payment_date TIMESTAMP,
    status VARCHAR(20) CHECK (status IN ('PAID', 'UNPAID', 'OVERDUE')),
    FOREIGN KEY (student_id) REFERENCES students(indeks_no)
);

CREATE TABLE login_attempt (
    login_attempt_id INT PRIMARY KEY,
    user_id INT,
    date TIMESTAMP,
    number_attempts INT,
    success BOOLEAN,
    ip_address VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE two_factor_auth (
    tfa_id INT PRIMARY KEY,
    user_id INT,
    secret_key VARCHAR(255),
    enabled BOOLEAN,
    verified_code VARCHAR(10),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE password_reset (
    reset_id INT PRIMARY KEY,
    user_id INT,
    token VARCHAR(255),
    request_date TIMESTAMP,
    completed BOOLEAN,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE email_change (
    change_id INT PRIMARY KEY,
    user_id INT,
    new_email VARCHAR(255),
    activation_link VARCHAR(255),
    status VARCHAR(20) CHECK (status IN ('PENDING', 'CONFIRMED')),
    request_date TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE notifications (
    notification_id INT PRIMARY KEY,
    user_id INT NULL,
    role VARCHAR(50) NULL CHECK (role IN ('STUDENT', 'TEACHER', 'ADMIN')),
    group_id INT NULL,
    message VARCHAR(2000) NOT NULL,
    type VARCHAR(50) NOT NULL CHECK (type IN ('INFO', 'WARNING', 'ALERT')),
    channel VARCHAR(50) NOT NULL CHECK (channel IN ('EMAIL', 'SMS', 'SYSTEM')),
    sent_date TIMESTAMP NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (group_id) REFERENCES groups(group_id)
);


