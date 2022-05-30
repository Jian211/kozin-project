<template>
    <h1 class="page-title">{{title}}</h1>
</template>

<script>

export default {
    props : {
        title : {
            type : String,
            default : "This is pageTitle exam from components"
        }
    }
}
</script>
<style scoped>
.page-title {
    border : 1px solid red;
    background-color: aqua;
}

</style>