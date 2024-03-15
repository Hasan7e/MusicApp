/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author macbook
 */
public class LikedSong extends MusicLibrary {
    
    
    
    
    public LikedSong(){
        songStack=new Stack<>();
        rapSong=new ArrayList<>();
        popSong=new ArrayList<>();
        
    }
    
    
    @Override
    public boolean addSong(Song song){
        songStack.push(song);
        
        return true;
        
        
    }
    
      @Override
    public String viewSongList() {
        StringBuilder list = new StringBuilder();
        for (Song song : songStack) {
            list.append(song.getName()).append("\n");
        }
        return list.toString();
    }
    
    
    public Stack<Song> getSongStack(){
        return songStack;
    }

    
//    @Override
//    public Song viewSong(){
//        for (Song song : songStack) {
//        return  song;
//    }
//        return  song;
//    }
    
    @Override
    public boolean deleteSong(){
       if (!songStack.isEmpty()) {
        songStack.pop();
        return true;
    }
    return false; 
        
    }
    
    @Override
    public boolean shuffleSong(){
        return false;
    }
    
    
    
}
