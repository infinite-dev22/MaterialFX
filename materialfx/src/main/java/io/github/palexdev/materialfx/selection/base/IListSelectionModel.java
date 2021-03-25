/*
 *     Copyright (C) 2021 Parisi Alessandro
 *     This file is part of MaterialFX (https://github.com/palexdev/MaterialFX).
 *
 *     MaterialFX is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     MaterialFX is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with MaterialFX.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.palexdev.materialfx.selection.base;

import javafx.beans.property.MapProperty;
import javafx.scene.input.MouseEvent;

import java.util.List;

public interface IListSelectionModel<T> {
    void select(int index, T data, MouseEvent mouseEvent);
    void updateIndex(T data, int index);
    void clearSelectedItem(int index);
    void clearSelectedItem(T item);
    void clearSelection();
    T getSelectedItem();
    T getSelectedItem(int index);
    List<T> getSelectedItems();
    MapProperty<Integer, T> selectedItemsProperty();
    boolean allowsMultipleSelection();
    void setAllowsMultipleSelection(boolean multipleSelection);
}
