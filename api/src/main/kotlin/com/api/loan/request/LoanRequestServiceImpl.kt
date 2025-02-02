package com.api.loan.request

import com.api.loan.GenerateKey
import com.api.loan.encrypt.EncryptComponent
import com.domain.repository.UserInfoRepository
import org.springframework.stereotype.Service

@Service
class LoanRequestServiceImpl(
    private val generateKey: GenerateKey,
    private val userInfoRepository: UserInfoRepository,
    private val encryptComponent: EncryptComponent
): LoanRequestService {
    override fun loanRequestMain(

        loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): LoanRequestDto.LoanRequestResponseDto {
        val userKey = generateKey.generateUserKey()

        loanRequestInputDto.userRegistrationNumber =
            encryptComponent.encryptString(loanRequestInputDto.userRegistrationNumber)

        saveUserInfo(loanRequestInputDto.toUserInfoDto(userKey))

        loanRequestReview(userKey)

        return LoanRequestDto.LoanRequestResponseDto(userKey)
    }

    override fun saveUserInfo(userInfoDto: UserInfoDto) =
        userInfoRepository.save(userInfoDto.toEntity())

    override fun loanRequestReview(userKey: String) {
        TODO("Not yet implemented")
    }
}
