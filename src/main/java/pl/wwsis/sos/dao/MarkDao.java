package pl.wwsis.sos.dao;

public interface MarkDao {
   
    float getValue(Integer markId);
    Boolean isFinal(Integer markId);
}