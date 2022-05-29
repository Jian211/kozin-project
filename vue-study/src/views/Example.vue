<template>
<div>
    <div>@click 이벤트를 통해 함수 연결 시켜보기</div>
    <button type="button" @click="one(),two()">Add 1</button>
    <p>The count is : {{counter}}</p>
    <select v-model="city" @change="changeSelect">
        <option value="서울">서울</option>
        <option value="제주">제주</option>
        <option value="부산">부산</option>
    </select>
    
    <hr>
    <div>
        <input type="text" v-model="textValue" @keyup.enter="showValue">

    </div>
    <hr>
    <h2>Computed란 </h2>
    <input type="text" v-model="firstName" />
    <input type="text" v-model="lastName" />
    <h4>{{firstName + lastName}}</h4>
    <h4>{{firstName}}{{lastName}}</h4>
    <h3>{{fullName}}</h3>

    <hr>
    <h2>Watch</h2> 
    <input type="text" v-model.number="x1" @keyup="plusValue" />
    <input type="text" v-model.number="x2" @keyup="plusValue" />
    <input type="text" v-model.number="y"/>
</div>

</template>

<script>
export default {
    name:'sample-name',
    components:{},
    data(){
        return {
            sampleData:'',
            counter:0,
            city:"",
            textValue:'',
            firstName:"지",
            lastName:"명근",
            x1:0,
            x2:0,
            y:0,
        };
    },
    watch:{
        y(){
            console.log(this.y+"로 값이 변경되었습니다.")
            if(this.y > 50){
                alert("50이 넘었습니다. 조심하십쇼. 0으로 초기화 됩니다.")
                this.x1 = 0;
                this.x2 = 0;
                this.y = 0;
            }
        }
    },
    computed:{
        fullName:{
            get: function(){
                return this.firstName + ' ' + this.lastName
            },
            set : function(newValue){
                var names = newValue.split(' ');
                console.log(names)
                this.firstName = names[0]
                this.lastName = names[names.length - 1]
            }
        }
    },
    setup(){},
    created(){},
    mounted(){    },
    unmounted(){},
    methods:{
        increaseCounter(){
            this.counter += 1;
        },
        one(){

        },
        showValue(){
            alert(this.textValue);
        },
        changeSelect(){
            alert(this.city)
        },
        plusValue(){
            return this.y = this.x1 + this.x2
        }
    }
}
</script>

<style scoped>
</style>