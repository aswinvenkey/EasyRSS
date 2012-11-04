/*******************************************************************************
 * Copyright (c) 2012 Pursuer (http://pursuer.me).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Pursuer - initial API and implementation
 ******************************************************************************/

package com.pursuer.reader.easyrss;

public interface VerticalSingleItemViewListener {
    void onImageViewRequired(String imgPath);

    void showLastItem();

    void showNextItem();

    void showWebsitePage(String url, boolean isMobilized);
}
