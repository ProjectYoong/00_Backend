package com.yoong.projectyoongbackend.domain.issue.issue.repository

import com.yoong.projectyoongbackend.domain.issue.issue.entity.Issue
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IssueRepository {
}

interface IssueJpaRepository: JpaRepository<Issue, Long>


class IssueRepositoryImpl(
    private val issueJpaRepository: IssueJpaRepository
)