package com.obj;

import java.io.*;

public class UpdateObjectFile {

    public static void main(String[] args) throws Exception {

        String fileName = "employee.dat";
        String tempFile = "temp.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tempFile));

        try {
            while (true) {
                Employee emp = (Employee) ois.readObject();

                if (emp.id == 101) {
                    emp.name = "Updated Name";
                    emp.salary = 123456;
                }

                oos.writeObject(emp);
            }
        } catch (EOFException e) {
            // End of file
            System.out.println("---------------- End of File ----------------");

        }

        ois.close();
        oos.close();

        System.out.println("Employee Updated Successfully!");
    }
}