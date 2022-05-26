<template>
<div>
    <h1 v-if="type=='A'">A</h1>
    <h1 v-else-if="type=='B'">B</h1>
    <h1 v-else>C</h1>

    <hr>

    <h1 v-show="bRender">T</h1>
</div>
</template>

<script>
export default {
    name:'sample-name',
    components:{},
    data(){
        return {
            type:'x',
            bRender : true,
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
</style>