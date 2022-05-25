<template>
    <div>
        <h1>{{hello}}   </h1>
        <div>{{hello}}</div>
        <div v-html="htmlCode"/>
    </div>
</template>

<script>
export default {
    name:'sample-name',
    components:{},
    data(){
        return {
            hello:'Hello!!!',
            htmlCode:'<p style="color:red">Im red</p>'
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