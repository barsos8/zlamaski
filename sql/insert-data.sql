-- INSERT DATA FOR USERS
INSERT INTO users (user_id, first_name, last_name, email, password_hash, registration_token, last_login_date, failed_login_attempts, role, status)
VALUES
(1, 'Jan', 'Kowalski', 'jan.kowalski@example.com', 'hashed_password_1', NULL, '2024-07-10 10:00:00', 0, 'STUDENT', TRUE),
(1001, 'Anna', 'Nowak', 'anna.nowak@example.com', 'hashed_password_2', NULL, '2021-01-25 10:00:00', 0, 'TEACHER', TRUE);

-- INSERT DATA FOR GROUPS
INSERT INTO groups (group_id, name, students_begin_year, study_direction)
VALUES (1, 'Group A', 2023, 'Computer Science');

-- INSERT DATA FOR STUDENTS
INSERT INTO students (indeks_no, user_id, group_id)
VALUES ('S12345', 1, 1);

-- INSERT DATA FOR TEACHERS
INSERT INTO teachers (user_id)
VALUES (1001);

-- INSERT DATA FOR SUBJECTS
INSERT INTO subjects (subject_id, title, code, semester, ects, number_of_seats)
VALUES (1, 'INTRODUCE TO NETWORKS', 'DB101', '2024Z', 15, 30);

-- INSERT DATA FOR SUBJECT_TEACH
INSERT INTO subject_teach (subject_teach_id, subject_id, teacher_id, group_id, semester)
VALUES (1, 1, 1001, 1, '2024Z');

-- INSERT DATA FOR SCHEDULE
INSERT INTO schedule (schedule_id, subject_id, group_id, semester, day_of_week, start_time, end_time, room, subject_teach_id)
VALUES (1, 1, 1, '2024Z', 'MONDAY', '10:00:00', '12:00:00', 'Room 101', 1);

-- INSERT DATA FOR ENROLLMENTS
INSERT INTO enrollments (enrollment_id, student_id, subject_id, schedule_id, semester, enrollment_date, status, is_waiting_on_list, resignation_deadline)
VALUES (1, 'S12345', 1, 1, '2024Z', '2024-07-01 10:00:00', 'ACTIVE', FALSE, '2025-09-15');

-- INSERT DATA FOR MARKS
INSERT INTO marks (mark_id, enrollment_id, date, value, type, comment,is_final)
VALUES (1, 1, '2025-01-30 10:00:00', 4.5, 'EXAM', 'Final exam', TRUE);

-- INSERT DATA FOR BOOKS
INSERT INTO books (book_id, title, author, publisher, issue_date, status)
VALUES (1, 'SQL Fundamentals', 'John Nowak', 'TechPress', '2020-06-01', 'AVAILABLE');

-- INSERT INTO RENT_BOOK
INSERT INTO rent_book (rent_book_id, book_id, student_id, rent_date, return_date, returned, overdue)
VALUES (1, 1, 'S12345', '2024-09-10 15:00:00', NULL, FALSE, FALSE);

-- INSERT INTO PAYMENTS
INSERT INTO payments (payment_id, student_id, amount, payment_date, status)
VALUES (1, 'S12345', 500.00, '2024-09-30 10:00:00', 'PAID');

-- INSERT INTO LOGIN_ATTEMPT
INSERT INTO login_attempt (login_attempt_id, user_id, date, number_attempts, success, ip_address)
VALUES (1, 1, '2024-07-10 10:00:00', 1, TRUE, '192.168.1.1');

-- INSERT INTO TWO_FACTOR_AUTH
INSERT INTO two_factor_auth (tfa_id, user_id, secret_key, enabled, verified_code)
VALUES (1, 1, 'SECRETKEY123', TRUE, '123456');

-- INSERT INTO PASSWORD_RESET
INSERT INTO password_reset (reset_id, user_id, token, request_date, completed)
VALUES (1, 1, 'RESETTOKEN123', '2024-01-10 10:00:00', FALSE);

-- INSERT INTO EMAIL_CHANGE
INSERT INTO email_change (change_id, user_id, new_email, activation_link, status, request_date)
VALUES (1, 1, 'jan.kowalski@example.com', 'https://activation.link', 'PENDING', '2024-12-03 20:00:00');

-- INSERT INTO NOTIFICATIONS
INSERT INTO notifications (notification_id, user_id, group_id, role, message, type, channel, sent_date)
VALUES (1, 1, NULL, NULL,'Welcome to the system!', 'INFO', 'EMAIL', '2024-07-10 10:00:01');                                            

-- nowy student
INSERT INTO users (user_id, first_name, last_name, email, password_hash, registration_token, last_login_date, failed_login_attempts, role, status)
VALUES (2, 'Joanna', 'Kowalska', 'joanna.kowalska@student.edu', 'hashed_password2', 'token456', '2024-08-15 10:00:00', 0, 'STUDENT', true);

INSERT INTO students (indeks_no, user_id, group_id)
VALUES ('S12346', 2, 1);

-- nowy nauczyciel
INSERT INTO users (user_id, first_name, last_name, email, password_hash, registration_token, last_login_date, failed_login_attempts, role, status)
VALUES (1002, 'Dr. Jan', 'Nowak', 'jan.nowak@teacher.edu', 'hashed_password3', 'token789', '2022-05-15 15:00:00', 0, 'TEACHER', true);

INSERT INTO teachers (user_id)
VALUES (1002);

-- nowy przedmiot
INSERT INTO subjects (subject_id, title, code, semester, ects, number_of_seats)
VALUES (2, 'Databases', 'DB102', '2024Z', 20, 35);

-- Przypisanie nowego nauczyciela do nowego przedmiotu i grupy
INSERT INTO subject_teach (subject_teach_id, subject_id, teacher_id, group_id, semester)
VALUES (2, 2, 1002, 1, '2024Z');

-- nowy wpis w planie zajęć
INSERT INTO schedule (schedule_id, subject_id, group_id, semester, day_of_week, start_time, end_time, room, subject_teach_id)
VALUES (2, 2, 1, '2024Z', 'TUESDAY', '10:00:00', '11:30:00', 'B202', 2);

-- zapis drugiego studenta na nowy przedmiot
INSERT INTO enrollments (enrollment_id, student_id, subject_id, schedule_id, semester, enrollment_date, status, is_waiting_on_list, resignation_deadline)
VALUES (2, 'S12346', 2, 2, '2024Z', '2024-08-20 12:00:00', 'ACTIVE', false, '2024-11-01');

-- ocena dla drugiego studenta
INSERT INTO marks (mark_id, enrollment_id, date, value, type, comment,is_final)
VALUES (2, 2, '2024-12-10 09:00:00', 5.0, 'PROJECT', 'Database design', true);

-- nowa książka i wypożyczenie przez studenta
INSERT INTO books (book_id, title, author, publisher, issue_date, status)
VALUES (2, 'Database Design', 'Jane Smith', 'EduBooks', '2020-01-01', 'RENTED');

INSERT INTO rent_book (rent_book_id, book_id, student_id, rent_date, return_date, returned, overdue)
VALUES (2, 2, 'S12346', '2024-10-01 08:30:00', NULL, false, false);

-- płatność studenta
INSERT INTO payments (payment_id, student_id, amount, payment_date, status)
VALUES (2, 'S12346', 200.00, '2024-10-25 13:00:00', 'UNPAID');

-- próba logowania i uwierzytelnianie dwuskładnikowe
INSERT INTO login_attempt (login_attempt_id, user_id, date, number_attempts, success, ip_address)
VALUES (2, 2, '2024-10-21 08:00:00', 1, true, '10.0.0.2');

INSERT INTO two_factor_auth (tfa_id, user_id, secret_key, enabled, verified_code)
VALUES (2, 2, 'SECRET456', true, '654321');

-- Zmiana e-maila
INSERT INTO email_change (change_id, user_id, new_email, activation_link, status, request_date)
VALUES (2, 2, 'joanna.kowalska@newmail.com', 'link456', 'PENDING', '2024-10-26 14:00:00');

-- Notyfikacja
INSERT INTO notifications (notification_id, user_id, group_id, role, message, type, channel, sent_date)
VALUES (2, NULL, NULL,'STUDENT', 'Zbliża się termin rejestracji na przedmioty', 'INFO', 'EMAIL', '2024-10-28 09:30:00');

