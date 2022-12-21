package org.mdeveloperz.estore.usecase

import io.ktor.client.call.*
import io.ktor.client.request.*
import org.mdeveloperz.estore.model.ProductModel
import org.mdeveloperz.estore.networkClient

class GetProductsUseCase: BaseUseCase<Unit, List<ProductModel>>() {
    override suspend fun execute(request: Unit): List<ProductModel> {
        val response = networkClient.get("https://api.escuelajs.co/api/v1/products")
        return response.body()
    }
}