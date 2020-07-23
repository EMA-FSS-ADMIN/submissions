/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package ke.co.miles.submissions.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** @author tonni */
public class ObjectUtils {
	
  public static <K, V> List<KeyValueContainer<K, V>> toList(Map<K, V> map) {
    if (map == null || map.isEmpty()) {
      return new ArrayList<>();
    }
    return map.entrySet().stream()
        .map(e -> new KeyValueContainer<>(e.getKey(), e.getValue()))
        .collect(Collectors.toList());
  }

  public static <K, V> Map<K, V> toMap(List<KeyValueContainer<K, V>> list) {
    if (list == null || list.isEmpty()) {
      return new HashMap<>();
    }
    return list.stream()
        .collect(Collectors.toMap(KeyValueContainer::getKey, KeyValueContainer::getValue));
  }
}
