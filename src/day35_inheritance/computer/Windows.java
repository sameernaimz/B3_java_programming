package day35_inheritance.computer;

public class Windows extends Computer {


    String edgeVersion;

   public Windows(String os, int memory) {
        super(os, memory);
       //this.os = os;
       // this.memory = memory;

  }
    public Windows(String os, int memory, String edgeVersion) {
        //super(os, memory);
        this(os, memory);
        this.edgeVersion = edgeVersion;


    }


}
