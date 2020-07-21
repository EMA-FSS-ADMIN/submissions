/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package ke.co.miles.submissions.util.databuilders.common;

import ke.co.miles.submissions.models.common.Form;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class FormBuilder {

  private String uid;
  private Integer recordCount;

  public FormBuilder uid(String uid) {

    this.uid = uid;
    return this;
  }

  public FormBuilder recordCount(int recordCount) {

    this.recordCount = recordCount;
    return this;
  }

  public Form build() {
    return new Form(uid, recordCount);
  }
}
