package com.consumer.service

import com.domain.domain.LoanReview
import com.domain.repository.LoanReviewRepository
import org.springframework.stereotype.Service

@Service
class LoanRequestService(
    private val loanReviewRepository: LoanReviewRepository
) {

    fun loanRequest() {
        // TODO : CB Component 로 요청 보내기 -> 응답값을 DB 에 저장하기
    }

    private fun loanRequestToCb() {
        // TODO
    }

    private fun saveLoanReviewData(loanReview: LoanReview) = loanReviewRepository.save(loanReview)
}