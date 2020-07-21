/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package ke.co.miles.submissions.configurations;

import java.util.List;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@Configuration
@PropertySource(value = "classpath:kobo.properties")
@Getter
public class Kobo {
	
		@Value("${base.assets.url}")
	private String baseAssetsURL;	

	@Value("#{'${household.forms.uids}'.split(',')}")
	private List<String> householdFormsUids;

	@Value("#{'${market.forms.uids}'.split(',')}")
	private List<String> marketFormsUids;
	
	@Value("${access.token}")
	private String accessToken;	

	//To resolve ${} in @Value
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
