package com.dev.issuemanagementservice.domain.enums

enum class IssuePriority {
    LOW, MEDIUM, HIGH;

   companion object {
       operator fun invoke(priority: String) = valueOf(priority.uppercase())
   }
}