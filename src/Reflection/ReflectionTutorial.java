package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTutorial {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
          Cat myCat = new Cat("Stella", 6);
          System.out.println(myCat.getName());

          Field[] catFields = myCat.getClass().getDeclaredFields();
          for (Field catField : catFields) {
              if(catField.getName().equals("name")) {
                  catField.setAccessible(true);
                  catField.set(myCat, "Jimmy");
              }
          }

         System.out.println(myCat.getName());

          Method[] myMethods = myCat.getClass().getMethods();
          for (Method myMethod : myMethods) {
             System.out.println(myMethod.getName());
             System.out.println(myMethod.getReturnType());
             System.out.println(myMethod.getModifiers());
             System.out.println(myMethod.canAccess(myCat));
             System.out.println(" MMMMMMMMMMMMMM");
          }


    }
}
