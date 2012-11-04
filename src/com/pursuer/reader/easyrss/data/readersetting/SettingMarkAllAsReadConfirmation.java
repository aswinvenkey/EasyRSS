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

package com.pursuer.reader.easyrss.data.readersetting;

import com.pursuer.reader.easyrss.data.DataMgr;
import com.pursuer.reader.easyrss.data.Setting;

public class SettingMarkAllAsReadConfirmation extends AbsSetting<Boolean> {
    private static Boolean value;

    public SettingMarkAllAsReadConfirmation(final DataMgr dataMgr) {
        super(dataMgr);
    }

    @Override
    protected Boolean getDefault() {
        return true;
    }

    @Override
    protected String getName() {
        return Setting.SETTING_MARK_ALL_AS_READ_CONFIRMATION;
    }

    @Override
    protected Boolean getStaticValue() {
        return value;
    }

    @Override
    protected void setStaticValue(final Boolean value) {
        SettingMarkAllAsReadConfirmation.value = value;
    }

    @Override
    protected void setStaticValue(final String value) {
        SettingMarkAllAsReadConfirmation.value = Boolean.valueOf(value);
    }
}
