/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

/**
 *
 * @author macbook
 */
public class Song {
    private String name;
//    private String type;
//    private double duration;
    
    public Song(){
        name=new String();
//        type=new String();
//        duration=0.00;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        @Override
    public String toString() {
        return name;
    }

     
    
}
