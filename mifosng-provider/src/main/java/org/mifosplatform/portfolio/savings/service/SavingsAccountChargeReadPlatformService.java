/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.savings.service;

import java.util.Collection;

import org.mifosplatform.portfolio.charge.data.ChargeData;
import org.mifosplatform.portfolio.savings.data.SavingIdListData;
import org.mifosplatform.portfolio.savings.data.SavingsAccountAnnualFeeData;
import org.mifosplatform.portfolio.savings.data.SavingsAccountChargeData;

import org.mifosplatform.portfolio.savings.data.SavingsChargesSummaryData;

import org.mifosplatform.portfolio.savings.data.SavingsIdOfChargeData;


public interface SavingsAccountChargeReadPlatformService {

    ChargeData retrieveSavingsAccountChargeTemplate();

    Collection<SavingsAccountChargeData> retrieveSavingsAccountCharges(Long savingsAccountId, String status);

    SavingsAccountChargeData retrieveSavingsAccountChargeDetails(Long savingsAccountChargeId, Long savingsAccountId);

    Collection<SavingsAccountAnnualFeeData> retrieveChargesWithAnnualFeeDue();

    Collection<SavingsAccountAnnualFeeData> retrieveChargesWithDue();

    
    Collection<SavingsChargesSummaryData> retriveCharge(Long savings_account_id,String chargeonDate);


    Collection<SavingsIdOfChargeData> retriveAllSavingIdHavingDepositCharge(String startDate);

    Collection<SavingIdListData> retriveSavingAccountForApplySavingDepositeFee(final String startDateofMonth);

    Collection<SavingIdListData> retriveAllSavingIdForApplyDepositeLateCharge();

    SavingsIdOfChargeData retriveOneWithMaxOfDueDate(Long savingId);
    
   SavingIdListData retriveMaxOfTransaction(Long savingId);

}
