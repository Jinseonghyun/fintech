package com.api.loan.request

import com.domain.domain.UserInfo

data class UserInfoDto(
    val userKey: String,
    val userName: String,
    val userRegistrationNumber: String,
    val userIncomeAmount: Long
) {
    fun toEntity(): UserInfo =
        UserInfo(
            userKey, userRegistrationNumber, userName, userIncomeAmount
        )
}