<template>
    <div>
        <h1>TEST</h1>
        <h1>{{hello}}</h1>
    </div>
</template>


<script>
import http from '../http-common';

export default {
    name: 'HelloWorld',
    props: {
        msg: String
    },
    data(){
        return {
        hello : ""
        }
    },
    methods: {
        retrieveUesrs(){
        http
            .get("/hello")
            .then(res => {
            this.hello = res.data;
            console.log(res.data);
            })
            .catch( e => {
            console.log("e : " + e);
            })
        }
    },
    mounted(){
        this.retrieveUesrs();
    }
}
</script>