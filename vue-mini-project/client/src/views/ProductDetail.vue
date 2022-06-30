<template>
    <div>
        <main class="mt-3">
            <div class="container">
                <div class="row">
                    <div class="col-md-5">
                        <div id="carouselExampleSlidesOnly" class="carousel carousel-dark slide" data-bs-ride="carousel">
                            <div class="carousel-inner">
                                <div class="carousel-item active">
                                    <img src="http://thumbnail.10x10.co.kr/webimage/image/basic/381/B003819928-1.jpg?cmd=thumb&w=500&h=500&fit=true&ws=false" class="d-block w-100" alt="...">
                                </div>
                                <div class="carousel-item">
                                    <img src="http://thumbnail.10x10.co.kr/webimage/image/basic/381/B003819928-1.jpg?cmd=thumb&w=500&h=500&fit=true&ws=false" class="d-block w-100" alt="...">
                                </div>
                                <div class="carousel-item">
                                    <img src="http://thumbnail.10x10.co.kr/webimage/image/basic/381/B003819928-1.jpg?cmd=thumb&w=500&h=500&fit=true&ws=false" class="d-block w-100" alt="...">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-7">
                        <div class="card shadow-sm" >
                            <div class="card-body">
                                <h5 class="card-title">{{productDetail.productName}}</h5>
                                <h5 class="card-title pt-3 pb-3 border-top">{{productDetail.productPrice}}원</h5>
                                <p class="card-text pt-3 pb-3 border-top">
                                    <span class="badge bg-secondary">전제제품</span>
                                    <span class="badge bg-secondary">컴퓨터</span>
                                    <span class="badge bg-secondary">악세사리</span>
                                </p>
                                <p class="card-text pb-3">
                                    배송비 {{productDetail.deliveryPrice}}원 | 도서산관(제주도) 배송비 추가 5,000원 | 택배배송 | 5일 이내 출고
                                </p>
                                <div class="card-text pb-3 border-top">
                                    <div class="row">
                                        <div class="col-auto">
                                            <label for="" class="col-form-label">구매수량</label>
                                        </div>
                                        <div class="col-auto">
                                            <div class="input-group">
                                                <span class="input-group-text">-</span>
                                                <input type="text" v-bind:value="count" class="form-control" style="width: 40px;">
                                                <span class="input-group-text">+</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row pt-3 pb-3 border-top">
                                    <div class="col-6">
                                        <h3>총 상품 금액</h3>
                                    </div>
                                    <div class="col-6" style="text-align: right;">
                                        <h3>{{count * productDetail.productPrice}}</h3>
                                    </div>
                                </div>
                                <div class="d-flex justify-content-between align-content-center ">
                                    <div class="col-6 d-grid p-1">
                                        <button class="btn btn-lg btn-dark">장바구니담기</button>
                                    </div>
                                    <div class="col-6 d-grid p-1">
                                        <button class="btn btn-lg btn-danger">주문하기</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <img class="img-fluid" src="https://cdn.funshop.co.kr/products/0000181559/637884811574696835.jpg">
                    </div>
                </div>
            </div>
        </main>
    </div>
</template>

<script>
import axios from "axios"

export default {

    data(){
        return {
            productDetail: {},
            count : 0
        }
    },
    created() {
        this.getProductDetail();
    },

    methods: {
        async getProductDetail() {
            console.log("안녕하세요 테스트할게요")

            this.productDetail = await ( await axios.get('/api'+this.$route.fullPath)).data
            console.log(this.productDetail)
        }

    },
}
</script>
