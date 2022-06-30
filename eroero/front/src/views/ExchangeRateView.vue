<template>
<div class="container">
    <header class="d-flex justify-content-center py-3">
        <ul class="nav nav-pills">
            <li class="nav-item" >
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                為替レート照会
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="#">日別に</a></li>
                    <li><a class="dropdown-item" href="#">期間別に</a></li>
                    <li><a class="dropdown-item" href="#">期間別平均</a></li>
                </ul>
            </li>
            <li class="nav-item"><a href="#" class="nav-link">為替グラフ</a></li>
            <li class="nav-item"><a href="#" class="nav-link">Pricing</a></li>
            <li class="nav-item"><a href="#" class="nav-link">FAQs</a></li>
            <li class="nav-item"><a href="#" class="nav-link">About</a></li>
        </ul>
    </header>
    <button @click="upToDateExchangeRates()">환율최신화</button>
</div>
</template>

<script>
export default {
    name:'sample-name',
    components:{},
    data(){
        return {
            sampleData:''
        };
    },
    setup(){},
    created(){},
    mounted(){},
    unmounted(){},
    methods:{
        // 일본 한국 미국에 대한 환율정보 최신화
        upToDateExchangeRates(){
            console.log("최신환율 정보 받아오기")          
            this.$api('/api/v1/update/ExchangeRates',{},'POST')
            
        },
    }
}
</script>

<style scoped>
</style>