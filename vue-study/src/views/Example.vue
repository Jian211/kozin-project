<template>
<div>
    <button @click="checkNowData">MOM AND FAM BTN</button>
    <ChildComponent ref="childForm" />
</div>
</template>

<script>
//components
import ChildComponent from './ChildComponent.vue'

export default {
    name:'sample-name',
    components:{ChildComponent},
    computed:{
        msg(){
            return this.$refs.childForm.msg;
        },
    },
    data(){
        return {
        };
    },
    setup(){},
    created(){},
    mounted(){},
    unmounted(){},
    methods:{
        checkNowData: function(){
            console.log(this.msg);
            console.log(this.$refs.childForm.msg)
        }
    }
}
</script>

<style scoped>
</style>