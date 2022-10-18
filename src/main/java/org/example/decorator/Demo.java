package org.example.decorator;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nВасилий Васильев, 10000\nПетр петров, 912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("C:\\Users\\crips\\IdeaProjects\\StructuralPatterns\\src\\main\\resources\\OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("C:\\Users\\crips\\IdeaProjects\\StructuralPatterns\\src\\main\\resources\\OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
