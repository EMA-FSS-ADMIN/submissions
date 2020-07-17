/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.forms.choices.households;

/**
 * @since 0.0.1
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum HHFoodInsecurityStatusChoice {
  YES("yes"),
  NO("no");

  private HHFoodInsecurityStatusChoice(String name) {
    this.name = name;
  }

  public static HHFoodInsecurityStatusChoice findByName(String name) {

    if (name == null || name.trim().isEmpty()) {
      return null;
    }
		
    switch (name) {
      case "yes":
        return YES;
      case "no":
        return NO;
      default:
        return null;
    }
  }

  public String getName() {
    return name;
  }

  private final String name;
}