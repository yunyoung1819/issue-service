package com.dev.issuemanagementservice.service

import com.dev.issuemanagementservice.domain.Issue
import com.dev.issuemanagementservice.domain.IssueRepository
import com.dev.issuemanagementservice.model.IssueRequest
import com.dev.issuemanagementservice.model.IssueResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueService(
    private val issueRepository: IssueRepository
) {
    @Transactional
    fun create(userId: Long, request: IssueRequest) : IssueResponse {

        val issue = Issue(
            summary = request.summary,
            description = request.description,
            userId = userId,
            type = request.type,
            priority = request.priority,
            status = request.status
        )
        return IssueResponse(issueRepository.save(issue))
    }
}