/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.livestock.health;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.forms.choices.households.HHAnimalHealthServicesAccessChoice;
import ke.co.miles.submissions.util.forms.choices.households.HHAnimalHealthServicesAccessFailureChoice;
import static ke.co.miles.submissions.util.forms.choices.households.HHAnimalHealthServicesAccessFailureChoice.MY_LIVESTOCK_DID_NOT_REQUIRE_MEDICATION;
import static ke.co.miles.submissions.util.forms.choices.households.HHAnimalHealthServicesAccessFailureChoice.OTHERS;
import static ke.co.miles.submissions.util.forms.choices.households.HHAnimalHealthServicesAccessFailureChoice.THERE_IS_NO_SUPPLY_OF_DRUGS_AND_VACCINES;
import static ke.co.miles.submissions.util.forms.choices.households.HHAnimalHealthServicesAccessFailureChoice.THERE_IS_SUPPLY_BUT_I_DID_NOT_HAVE_MONEY_TO_BUY;
import ke.co.miles.submissions.util.forms.choices.households.HHLivestockDiseaseChoice;
import static ke.co.miles.submissions.util.forms.choices.households.HHLivestockDiseaseChoice.SMALL_POX_DISEASE;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHLivestockHealthCategoricalObservationsBuilder {

	private boolean hhLivestockWereAttackedByADisease = false;
	private boolean hhLivestockWereAttackedByNewcastleDisease = false;
	private boolean hhLivestockWereAttackedByFootandMouthDisease = false;
	private boolean hhLivestockWereAttackedByAfricanSwineFeverDisease = false;
	private boolean hhLivestockWereAttackedByMangeDisease = false;
	private boolean hhLivestockWereAttackedBySmallPoxDisease = false;
	private boolean hhLivestockWereAttackedByOtherDiseases = false;
	private boolean hhLivestockRequiredMedication = false;
	private boolean animalHealthServicesAccess = false;
	private boolean hhDidNotAccessAnimalHealthServicesBecauseOfLackSupplies = false;
	private boolean hhDidNotAccessAnimalHealthServicesBecauseOfLackOfMoney = false;
	private boolean hhDidNotAccessAnimalHealthServicesBecauseOfOtherReasons = false;


	public HHLivestockHealthCategoricalObservationsBuilder livestockHealthServicesAccess(
			String hhAccessedAnimalHealthServices) {

		HHAnimalHealthServicesAccessChoice choice
				= HHAnimalHealthServicesAccessChoice.findByName(hhAccessedAnimalHealthServices);

		if (choice != null) {
			switch (choice) {
				case YES:
					this.animalHealthServicesAccess = true;
					break;
				case NO:
					break;
			}
		}

		return this;
	}

	public HHLivestockHealthCategoricalObservationsBuilder livestockHealthServicesAccessFailureCause(
			String animalHealthServicesAccessFailureCause) {

		HHAnimalHealthServicesAccessFailureChoice choice
				= HHAnimalHealthServicesAccessFailureChoice.findById(
						animalHealthServicesAccessFailureCause);

		if (choice != null) {
			switch (choice) {
				case MY_LIVESTOCK_DID_NOT_REQUIRE_MEDICATION:
					break;
				case THERE_IS_NO_SUPPLY_OF_DRUGS_AND_VACCINES:
					this.hhLivestockRequiredMedication = true;
					this.hhDidNotAccessAnimalHealthServicesBecauseOfLackSupplies = true;
					break;
				case THERE_IS_SUPPLY_BUT_I_DID_NOT_HAVE_MONEY_TO_BUY:
					this.hhLivestockRequiredMedication = true;
					this.hhDidNotAccessAnimalHealthServicesBecauseOfLackOfMoney = true;
					break;
				case OTHERS:
					this.hhLivestockRequiredMedication = true;
					this.hhDidNotAccessAnimalHealthServicesBecauseOfOtherReasons = true;
					break;
			}
		}

		return this;
	}

	public HHLivestockHealthCategoricalObservationsBuilder livestockDisease(String prevalentDisease) {

		HHLivestockDiseaseChoice choice;
		try {
			choice
					= HHLivestockDiseaseChoice.findById(Integer.parseInt(prevalentDisease));
		} catch (NumberFormatException e) {
			choice = null;
		}

		if (choice != null) {
			switch (choice) {
				case NONE:
					break;
				case NEWCASTLE_DISEASE:
					this.hhLivestockWereAttackedByADisease = true;
					this.hhLivestockWereAttackedByNewcastleDisease = true;
					break;
				case FOOT_AND_MOUTH_DISEASE:
					this.hhLivestockWereAttackedByADisease = true;
					this.hhLivestockWereAttackedByFootandMouthDisease = true;
					break;
				case AFRICAN_SWINE_FEVER:
					this.hhLivestockWereAttackedByADisease = true;
					this.hhLivestockWereAttackedByAfricanSwineFeverDisease = true;
					break;
				case MANGE:
					this.hhLivestockWereAttackedByADisease = true;
					this.hhLivestockWereAttackedByMangeDisease = true;
					break;
				case SMALL_POX_DISEASE:
					this.hhLivestockWereAttackedByADisease = true;
					this.hhLivestockWereAttackedBySmallPoxDisease = true;
					break;
				case OTHERS:
					this.hhLivestockWereAttackedByADisease = true;
					this.hhLivestockWereAttackedByOtherDiseases = true;
					break;
			}
		}

		return this;
	}

	public List<Phenomenon> build() {

		List<Phenomenon> categoricalObservations = new ArrayList<>();



		if (hhLivestockWereAttackedByADisease) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_A_DISEASE_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_A_DISEASE_NO)
					.build());
		}
		

		if (hhLivestockWereAttackedByNewcastleDisease) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_NEWCASTLE_DISEASE_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_NEWCASTLE_DISEASE_NO)
					.build());
		}

		if (hhLivestockWereAttackedByFootandMouthDisease) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_FOOT_AND_MOUTH_DISEASE_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_FOOT_AND_MOUTH_DISEASE_NO)
					.build());
		}
		

		if (hhLivestockWereAttackedByAfricanSwineFeverDisease) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_AFRICAN_SWINE_FEVER_DISEASE_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_AFRICAN_SWINE_FEVER_DISEASE_NO)
					.build());
		}
		

		if (hhLivestockWereAttackedByMangeDisease) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_MANGE_DISEASE_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_MANGE_DISEASE_NO)
					.build());
		}
		
		
		if (hhLivestockWereAttackedBySmallPoxDisease) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_SMALL_POX_DISEASE_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_SMALL_POX_DISEASE_NO)
					.build());
		}
		

		if (hhLivestockWereAttackedByOtherDiseases) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_OTHER_DISEASES_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_WERE_ATTACKED_BY_OTHER_DISEASES_NO)
					.build());
		}
		

		if (hhLivestockRequiredMedication) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_REQUIRED_MEDICATION_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_LIVESTOCK_REQUIRED_MEDICATION_NO)
					.build());
		}
		

		if (animalHealthServicesAccess) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_ACCESSED_ANIMAL_HEALTH_SERVICES_FOR_ITS_LIVESTOCK_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_ACCESSED_ANIMAL_HEALTH_SERVICES_FOR_ITS_LIVESTOCK_NO)
					.build());
		}
		

		if (hhDidNotAccessAnimalHealthServicesBecauseOfLackSupplies) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_ANIMAL_HEALTH_SERVICES_BECAUSE_OF_LACK_SUPPLY_OF_DRUGS_AND_VACCINES_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_ANIMAL_HEALTH_SERVICES_BECAUSE_OF_LACK_SUPPLY_OF_DRUGS_AND_VACCINES_NO)
					.build());
		}
		

		if (hhDidNotAccessAnimalHealthServicesBecauseOfLackOfMoney) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_ANIMAL_HEALTH_SERVICES_BECAUSE_OF_LACK_OF_MONEY_TO_BUY_THE_SUPPLIES_WITH_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_ANIMAL_HEALTH_SERVICES_BECAUSE_OF_LACK_OF_MONEY_TO_BUY_THE_SUPPLIES_WITH_NO)
					.build());
		}
		

		if (hhDidNotAccessAnimalHealthServicesBecauseOfOtherReasons) {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_ANIMAL_HEALTH_SERVICES_BECAUSE_OF_OTHER_REASONS_YES)
					.build());
		} else {
			categoricalObservations.add(new PhenomenonBuilder()
					.phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_ANIMAL_HEALTH_SERVICES_BECAUSE_OF_OTHER_REASONS_NO)
					.build());
		}
		
		return categoricalObservations;
	}
}
