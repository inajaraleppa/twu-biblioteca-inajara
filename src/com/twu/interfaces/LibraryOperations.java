package com.twu.interfaces;

/**
 * Created by ileppa on 9/21/15.
 */
public interface LibraryOperations {
    void checkoutItem(int position);

    void returnItem(int position);

    int getByName(String name);

}
