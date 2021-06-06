package sef.Final_Task.Activity1;


public  class Person {

    public String name;
    public int age;


    public Person() {
        this.name = name;

        this.age = age;

    }

    public String introduction() {
        System.out.println("Hi my name is " + name + " And I'm " + age + " years old");
        return "Hi my name is " + name + " And I'm " + age + " years old";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomizedException {
        this.name = name;
        char[] chars = name.toCharArray();
        for(char c: chars) {
            if(Character.isDigit(c)){ throw new CustomizedException(" Name contains numbers ");}
        }

    }











        }

















































