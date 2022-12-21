package org.mdeveloperz.estore.usecase

abstract class BaseUseCase<REQUEST, RESULT> {
    @Throws(Exception::class)
    abstract suspend fun execute(request: REQUEST): RESULT
}