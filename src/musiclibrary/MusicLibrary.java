/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author macbook
 */
public abstract class MusicLibrary {

    protected Stack<Song> songStack;
    protected ArrayList<Song> rapSong;
    protected ArrayList<Song> popSong;
    
    
    public MusicLibrary(){
//        songStack=new Stack<>();
//        rapSong=new ArrayList<>();
//        popSong=new ArrayList<>();
          
    }
    
    public abstract boolean addSong(Song song);
    
    public abstract boolean deleteSong();
   
    public abstract String viewSongList();
    
    public abstract boolean shuffleSong();
    
    
    
}
