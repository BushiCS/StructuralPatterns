package org.example.adapter;

public class Demo {
    public static void main(String[] args) {
        BinaryDataSource binaryDataSource = new BinaryDataSourceImpl();
        BinaryAdapter binaryAdapter = new BinaryAdapterImpl(binaryDataSource);
        System.out.println(binaryAdapter.getDataAsString());
    }
}
