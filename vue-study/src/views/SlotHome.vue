<template>
    <SlotHomeLayout>
        <template v-slot:header>
            <PageTitle/>
        </template>
        <template v-slot:main>
            <h1>main입니다.</h1>
        </template>
        <template v-slot:footer>
            <h1>footer입니다.</h1>
        </template>
    </SlotHomeLayout>
</template>

<script>
//slot
import SlotHomeLayout from './SlotHomeLayout.vue'

//components
import PageTitle from '../components/PageTitle.vue'

export default {
    name:'sample-name',
    components:{
        SlotHomeLayout,
        PageTitle,
    },
    data(){
        return {
            sampleData:''
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