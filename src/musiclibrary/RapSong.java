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
public class RapSong extends MusicLibrary {
    
    public RapSong(){
       rapSong=new ArrayList<>();
    }
    
    @Override
    public boolean addSong(Song song){
    rapSong.add(song);
    return true;
}
    
    @Override
   public boolean deleteSong() {
    if (!rapSong.isEmpty()) {
        rapSong.remove(rapSong.size() - 1);
        return true;
    }
    return false;
}
   
    @Override
public String viewSongList(){
    StringBuilder list = new StringBuilder();
    for (Song song : rapSong) {
        list.append(song.getName()).append("\n");
    }
    return list.toString();
}

    
    @Override
    public boolean shuffleSong() {
    if (!rapSong.isEmpty()) {
        Collections.shuffle(rapSong);
        return true;
    }
    return false;
}

    
    
}
