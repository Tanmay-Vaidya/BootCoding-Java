package com.bootcoding.array;

public class StringArray {
    public static void main(String[] args) {
        String arr[]={"Hyundai","Honda","Thar","Nexon","LandRover"};
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);

                String longest = arr[0];
                String shortest = arr[0];


                for (String str : arr) {

                    if (str.length() > longest.length()) {
                        longest = str;
                    }

                    if (str.length() < shortest.length()) {
                        shortest = str;
                    }
                }

                // Print the result
                System.out.println("Longest string is : " + longest);
                System.out.println("Shortest string is : " + shortest);
            }
        }





