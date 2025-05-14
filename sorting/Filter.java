package sorting;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    String name;
    int age;
    String branch;

    Filter(){
        super();
    }
    Filter(String name,int age, String branch){
        this.name= name;
        this.age=age;
        this.branch=branch;
    }

    public static void main(String[] args) {
        
        List<List<Filter>> list=new ArrayList<>();
        List<Filter>f=new ArrayList<>();
         f.add(new Filter("vinay",23,"cse"));
         f.add(new Filter("donald",24,"EEE"));
         f.add(new Filter("Maya",20,"Normal"));

         list.add(f);

    }
}
