package work;

import java.util.*;
public class work_6_1 {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();
        Person p1 = new Person("JACK",25);
        Person p2 = new Person("ROSE",23);
        Person p3 = new Person("JACK",27);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        for (Object obj:hashSet){
            Person p =(Person) obj;
            System.out.println(p.name+":"+p.age);
        }
    }
}
class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public int hashCode(){
        return name.hashCode();
    }
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        Person p = (Person) obj;
        return p.name.equals(this.name);
    }
}

