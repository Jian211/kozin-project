<template>
<div>
    <button @click="getProductList">조회</button>
    <hr>
    <table>
        <thead>
            <tr>
                <th>제품이름</th>
                <th>가격</th>
                <th>카테고리</th>
                <th>배송비</th>
            </tr>
        </thead>
        <tbody>
            <tr v-for="(product, i) in productList" :key="i">
                <th>{{product.product_name}}</th>
                <th>{{product.price}}</th>
                <th>{{product.category}}</th>
                <th>{{product.delivery_price}}</th>
            </tr>
        </tbody>

    </table>
</div>

</template>

<script>
//mixin
import ApiMixin from '../api.js'

export default {
    name:'sample-name',
    components:{},
    mixins:[ApiMixin],
    data(){
        return {
            productList:[]
        };
    },
    setup(){},
    created(){},
    mounted(){},
    unmounted(){},
    methods:{
        getProductList: async function(){
            this.productList = await this.$postmanApi('https://d76cc406-35d9-448e-857b-7b2e33788215.mock.pstmn.io/productList','get',{});
            console.log(this.productList);
        },
    }
}
</script>

<style scoped>
</style>