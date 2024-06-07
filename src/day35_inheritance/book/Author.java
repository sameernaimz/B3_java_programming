package day35_inheritance.book;

import my_utilities.StringUtil;

public class Author {
    private String name;
    private int age;


    public Author(String name, int age) {
        setName(name);
        this.age = age;

    }

    public String getName() {
        return name;
    }
    //"JoJP moyes" -- > Jojo Moyes - > ["joJO", "moyes"}
    public void setName(String name) {
        String result = "";
        for (String each : name.split(""))
            result += StringUtil.fixFormat(each);
     this.name = result.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //this.age = age;
        if(age > 10);
        this.age = age;
    }
}
