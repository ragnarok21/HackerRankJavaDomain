package Advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import Advanced.Student;

/**
 * Created by ramon on 03-02-16.
 */
public class JavaReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Student.class;
        Method[] methods = c.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<String>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}

