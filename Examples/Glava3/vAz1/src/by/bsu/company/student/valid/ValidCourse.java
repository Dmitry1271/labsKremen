package by.bsu.company.student.valid;

/**
 * Created by HP on 18.01.2017.
 */
public class ValidCourse {
    public static final int MAX_COURSE = 6;
    public static boolean isValidCoorse(int course){
        return (course>0&&course<=MAX_COURSE);
    }
}
