/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macbook
 */
public class PopSong extends MusicLibrary{
    
    public PopSong(){
        popSong=new ArrayList<>();
    }
    
    @Override
    public boolean addSong(Song song){
    popSong.add(song);
    return true;
}
    @Override
   public boolean deleteSong() {
    if (!popSong.isEmpty()) {
        popSong.remove(popSong.size() - 1);
        return true;
    }
    return false;
}
   
    @Override
    public String viewSongList(){
    StringBuilder list = new StringBuilder();
    for (Song song : popSong) {
        list.append(song.getName()).append("\n");
    }
    return list.toString();
}
    
    @Override
    public boolean shuffleSong() {
    if (!popSong.isEmpty()) {
        Collections.shuffle(popSong);
        return true;
    }
    return false;
}
   
    
}
