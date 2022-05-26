<template>
    <div>
        <h1>속성에 데이터 바인딩</h1>
        <!-- <img v-bind:src="url" style="height:200px" /> -->
        <input type="text" v-model="textValue" />
        <button type="button" v-bind:disabled="textValue==''" > Click </button>
    </div>

    <div class="container" v-bind:class="{'active':isActive, 'text-red':isRed}">
        <h1>클래스와 스타일에 대한 데이터 바인딩</h1>
    </div>

    <div class="container" v-bind:class="[activeClass, redClass]">
        <h1>클래스와 스타일에 대한 데이터 바인딩 배열 사용</h1>
    </div>
    <hr>
    <div v-bind:style="[baseStyle, overridingStyle]">
        인라인 스타일 Binding
    </div>

</template>

<script>
export default {
    name:'sample-name',
    components:{},
    data(){
        return {
            url:"https://kr.vuejs.org/images/logo.png",
            textValue :'',
            isActive:true,
            isRed: false,
            activeClass:'active',
            redClass:'text-red',
            styleObject: {
                backgroundColor: 'yellow',
                color:'red',
                fontWeigth:'bold'
            },
            baseStyle:'background-color:yellow;',
            overridingStyle:'color:red; font-weigth:bold;'
        };
    },
    setup(){},
    created(){},
    mounted(){},
    unmounted(){},
    methods:{}
}
</script>

<style scoped>
.container {
    width: 100%;
    height: 200px;
}

.active{
    background-color: yellow;
    font-weight: bold;
}

.text-red{
    color: red;
}
</style>