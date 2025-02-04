package com.domain.repository

import com.domain.domain.LoanReview
import org.springframework.data.jpa.repository.JpaRepository

interface LoanReviewRepository : JpaRepository<LoanReview, Long> {
    fun findByUserKey(userKey: String): LoanReview?
}