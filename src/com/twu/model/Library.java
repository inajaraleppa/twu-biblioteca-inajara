package com.twu.model;

import com.twu.interfaces.LibraryOperations;

/**
 * Created by ileppa on 9/21/15.
 */
public class Library {

    public String search;

    public boolean checkout(LibraryOperations lo){
        int position = lo.getByName(search);
        if(isInLibrary(position)){
            lo.checkoutItem(position);
        } else {
            return false;
        }
        return true;
    }

    public boolean returnItem(LibraryOperations lo){
        int position = lo.getByName(search);
        if(isInLibrary(position)){
            lo.returnItem(position);
        } else {
            return false;
        }
        return true;
    }

    boolean isInLibrary(int position){
        if(position != -1){
            return true;
        } else {
            return false;
        }
    }
}
