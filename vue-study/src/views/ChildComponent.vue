<template>
<div>
    <h1>자식에서온 {{msg}}</h1>
    <button @click="changeData">자식버튼</button>
</div>
</template>

<script>
export default {
    name:'sample-name',
    components:{},
    data(){
        return {
            msg:'자식에 있는 아유'
        };
    },
    setup(){},
    created(){},
    mounted(){},
    unmounted(){},
    methods:{
        changeData: function (){
            this.msg = '자식에 있습니다. 수정되었습니다.'
        }
    }
}
</script>

<style scoped>
</style>