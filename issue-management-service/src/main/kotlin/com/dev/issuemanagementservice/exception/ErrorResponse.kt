package com.dev.issuemanagementservice.exception

data class ErrorResponse(
    val code: Int,
    val message: String,
)