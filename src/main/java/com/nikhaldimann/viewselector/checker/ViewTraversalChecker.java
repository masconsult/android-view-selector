package com.nikhaldimann.viewselector.checker;

import java.util.Set;

import android.view.View;

import com.nikhaldimann.viewselector.selection.ViewSelection;

/**
 * Interface for checkers that traverse views trying to find views
 * that match some selector criterion.
 */
public interface ViewTraversalChecker {

    /**
     * Checks the given views for views that match some criterion.
     * @param views the views to check
     * @return the set of matched views
     */
    ViewSelection check(Set<View> views);

}
