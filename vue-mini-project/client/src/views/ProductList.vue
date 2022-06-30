<template>
<main class="mt-3">
    <div>
        <button @click="getProductList">Test</button>
    </div>
    <div class="container">
        <div class="row mb-5">
            <div class="col-12">
                <select class="form-select">
                    <option selected></option>
                    <option value="1">노트북</option>
                    <option value="2">모니터</option>
                    <option value="3">마우스/키보드</option>
                </select>
            </div>
        </div>
        <div class="row g-3">
            <div class="col-lg-3 col-md-6" v-for="(product, i) in productList" :key="i"  >
                <div class="card" style="width: 18rem;" >
                    <a @click="getProduct(product.id)" style="cursor:pointer">
                        <img :src="product.path" class="card-img-top">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">{{product.productName}}</h5>
                        <p class="card-text">
                            <span class="badge bg-secondary mr-1">{{product.category1}}</span>
                            <span class="badge bg-secondary mr-1">{{product.category2}}</span>
                            <span class="badge bg-secondary mr-1">{{product.category3}}</span>
                        </p>
                        <div class="d-flex justify-content-between align-content-center">
                            <div class="btn-group" role="group">
                                <button type="button" class="btn btn-sm btn-outline-secondary">장바구니</button>
                                <button type="button" class="btn btn-sm btn-outline-secondary">주문하기</button>
                            </div>
                            <small class="text-dark">{{product.productPrice}}</small>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>

</template>
<script>

export default {
    data(){
        return {
            productList : [],
        }
    },
    mounted(){
        console.log("만들어집니다.")
        this.getProductList();
    },
    methods : {
        async getProductList(){
            this.productList = await this.$api("/api/productList",{});
            console.log(this.productList)
        },
        getProduct(productId) {
            console.log("디테일로가즈아")
            console.log("productId = " +productId)
            this.$router.push('/detail/'+ productId)
            

        }
    }
}
</script>