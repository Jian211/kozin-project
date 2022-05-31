<template>
    <div>
        <injectView />
    </div>
</template>
<script>
import {provide} from 'vue';
import injectView from './InjectView.vue'

export default {
    components:{
        injectView
    },
    setup(){
        provide('title','vue.js 프로젝트');

    }        
}
</script>